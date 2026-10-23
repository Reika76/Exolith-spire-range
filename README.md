# Exolith Spire Range

A small NeoForge companion mod for Minecraft 1.21.1 and Exolith 0.1.3+. It makes the Starfall Spire's range configurable without modifying Exolith's jar.

## What the setting changes

The addon replaces the spire's squared 32-block radius in both the nearby-player check and the protection check. The default radius is 64 blocks. This affects the spire's range in the horizontal plane; it does not change meteor frequency, vertical range, or the spire's other behavior.

## Configure it

Launch once with the addon installed, then edit:

`config/exolith_spire_range-common.toml`

Set `starfallSpire.radius` to a value from 1 to 512 blocks. The default is `64.0`. Restart the game/server after changing it. On a server, the common config is controlled by the server installation.

## Build

Requirements: Java 21 and Gradle 8.14 or newer. From this directory, run:

```sh
gradle build
```

The compiled mod jar will be in `build/libs/`. Install that jar beside Exolith on the server and clients. The project targets Minecraft 1.21.1 and NeoForge 21.1.219; change `neo_version` in `gradle.properties` to match a different compatible NeoForge 21.1 build if needed.


## Build online without installing Java or Gradle locally

The project includes a GitHub Actions workflow at `.github/workflows/build.yml`. GitHub's hosted runner installs Java 21 and Gradle 8.14, builds the addon, and saves the jar as a downloadable workflow artifact.

1. Create a GitHub repository and upload the **contents** of this project folder (including the hidden `.github` folder) to its root. Do not upload only the ZIP as a single file.
2. Open the repository's **Actions** tab and select **Build addon**.
3. Choose **Run workflow**. After it completes, open the run and download the `exolith-spire-range` artifact. The downloaded artifact ZIP contains the mod jar.

This uses GitHub Actions in the cloud; Java and Gradle are installed on GitHub's runner, not on your computer. GitHub may require Actions to be enabled for the repository.
