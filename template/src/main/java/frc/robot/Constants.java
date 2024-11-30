// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final Mode currentMode = Mode.REAL;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }

  public static class BuildConstants {
    public static final String MAVEN_GROUP = "";
    public static final String MAVEN_NAME = "template";
    public static final String VERSION = "unspecified";
    public static final int GIT_REVISION = 6;
    public static final String GIT_SHA = "cc013129e3c7396cb75b6440b939e763719c4f9a";
    public static final String GIT_DATE = "2024-05-28 11:17:52 EDT";
    public static final String GIT_BRANCH = "main";
    public static final String BUILD_DATE = "2024-07-16 15:15:26 EDT";
    public static final long BUILD_UNIX_TIME = 1721157326492L;
    public static final int DIRTY = 1;
  }
}
