# test_ci

![gradle build](https://github.com/edurso/test_ci/workflows/gradle%20build/badge.svg?branch=master)

attempt at making a ci/cd environment for frc

__todo:__

- [ ] test_ci_pkg from `./src/main/java/frc/lightning/*`
  - [ ] __FILES__: maven file structure (would have to use maven or [gradle](https://help.github.com/en/packages/using-github-packages-with-your-projects-ecosystem/configuring-gradle-for-use-with-github-packages) somehow, look up)
    - [ ] main/
      - [ ] trajectory/
        - [ ] **NEW:** contains RobotPath *parent class*, AutoCommandGenerator *parent class*, etc.
      - [ ] commands/
      - [ ] logging/
      - [ ] subsystems/
      - [ ] testing/
      - [ ] PID/
      - [ ] faults/
      - [ ] controllers/
      - [ ] util/
      - [ ] LightningContainer.java
      - [ ] LightningRobot.java
    - [ ] test/
      - [ ] trajectory/
      - [ ] commands/
      - [ ] logging/
      - [ ] subsystems/
      - [ ] testing/
      - [ ] . . .
  - [ ] use as dependency in [test_ci](https://www.github.com/edurso/test_ci)
- [ ] github workflow for unit tests
  - [ ] badge on [README.md](https://github.com/edurso/test_ci/blob/master/README.md)
