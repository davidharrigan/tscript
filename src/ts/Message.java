/**
 * central location for generating standardized error messages.
 *
 */

package ts;

/** Group of static fields and methods that the system uses to generate
  * standardized error messages.
  */
public final class Message
{
  // should not be instantiated
  private Message() {}

  private static int errorCount = 0;

  private static boolean doLogging = false;

  private static Location location = null;

  /** Record current location during evaluation of the AST. */
  public static void setLocation(final Location loc)
  {
    location = loc;
  }

  /** Emit message for an error during evaluation and then exit. */
  public static void evaluationError(final String message)
  {
    assert location != null : "location is null";
    System.err.printf("%d: %s\n", location.line, message);
    System.exit(-1);
  }

  /** Emit message for a syntax error and then exit. Must be passed
   *  the location because this class only tracks Location during
   *  AST evaluation.
   */
  public static void syntaxError(final Location loc)
  {
    System.err.printf("%d: syntax error (column %d)\n", loc.line, loc.column);
    // parser stops with first syntax error so this method exits program
    System.exit(-1);
  }

  /** Emit message for a semantic error and then exit. Must be passed
   *  the location because this class only tracks Location during
   *  AST evaluation.
   */
  public static void error(final Location loc, final String message)
  {
    errorCount += 1;
    // just displaying the line number for now
    System.err.printf("%d: %s\n", loc.line, message);
  }

  /** Emit a message for a fatal user error, such as bad source file name. */
  public static void fatal(final String message)
  {
    System.err.println(message);
    System.exit(-1);
  }

  /** Return count of number of semantic errors detected. */
  public static int getErrorCount()
  {
    return errorCount;
  }

  /** Turn on logging of compiler developer messages. */
  public static void enableLogging()
  {
    doLogging = true;
  }

  /** Log (emit) compiler developer message (if enabled) */
  public static void log(String message)
  {
    if (doLogging)
    {
      System.err.printf("LOG: %s\n", message);
    }
  }

  /** Emit a message for an internal compiler error. */
  public static void bug(final Location loc, final String message)
  {
    System.err.printf("%d: %s\n", loc.line, message);
    System.exit(-1);
  }

  /** Emit the "usage" message for running the system. */
  public static void usage()
  {
    fatal("Usage: ts [-dump] [-log] [-noeval] file.ts");
  }
}

