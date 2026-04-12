![PORT-ECHO Graphic](https://spaceport.sh/assets/port-echo-graphic.png "PORT-ECHO Graphic")

# Port-Echo
Port-Echo is a Spaceport starter kit that provides the most basic structure and configuration
for building a Spaceport application, with no other assumptions.

See also: [Scaffolds](https://spaceport.sh/docs/scaffolds) for more information.


## Getting Started
If this is your first time using Spaceport, perhaps consider starting with PORT-MERCURY 
starter kit which provide the same basic structure and configuration, but provide some basic 
functionality to get you started. Use Port-Echo if you want to start from scratch and want 
to implement the basics yourself.

Developer Onboarding: [https://spaceport.com.co/docs/developer-onboarding](https://spaceport.sh/docs/developer-onboarding)


## Pre-requisites
- Java 8 or higher
- CouchDB 2.0 or higher


## Features
- Basic structure and configuration for a Spaceport application
- No assumptions about the application
- Ready to launch, just add your own code


## Startup
To start the application, run the following command:

```bash
java -jar spaceport.jar --start config.spaceport
```

This will start the application using the configuration file `config.spaceport`.

Don't have Spaceport? You can download it from the [Spaceport website](https://spaceport.sh/builds/). Or, use
the following command to grab the latest version:

```bash 
curl -L https://spaceport.sh/builds/spaceport-latest.jar -o spaceport.jar
```


## AI-Assisted Development

This starter kit includes a `documentation/` folder with the complete Spaceport framework documentation, which works great with AI coding assistants like [Claude Code](https://claude.ai/claude-code).

For the best experience, see [SETUP-AGENTS.md](SETUP-AGENTS.md) for two options:
- **Quick setup** — add a lightweight Spaceport Consultant agent to your project
- **Full setup** — install the [claude-spaceport-support](https://github.com/spaceport-dev/claude-spaceport-support) plugin for six specialized agents

Starting a brand-new project from scratch? Consider [agentic](https://github.com/spaceport-dev/agentic) instead — it bootstraps a full project with AI tooling built in.


## Learn more
For more information about Spaceport, visit the [Spaceport documentation](https://spaceport.sh/docs).
