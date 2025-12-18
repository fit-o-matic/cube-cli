///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS com.cube:cube-cli:1.0-SNAPSHOT

import picocli.CommandLine;

/**
 * JBang wrapper for Cube CLI
 * 
 * This allows running the app without building:
 *   jbang Cube.java migrate source target
 * 
 * To use the Maven-built version:
 *   1. Build: mvn clean install
 *   2. Run: jbang Cube.java
 */
public class Cube {
    public static void main(String... args) {
        int exitCode = new CommandLine(new at.smarttech.cube.cli.Cube()).execute(args);
        System.exit(exitCode);
    }
}
