@set CURRENT_DIR=%CD%
@set APP_HOME=%CD%\..
@cd %APP_HOME%

@set CLASSPATH=%APP_HOME%\*;%APP_HOME%\components\*;%APP_HOME%\libs\*

@set JVMOPTIONS=-showversion -Xms50m -Xmx50m
@set DEBUG=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_shmem,server=y,suspend=n,address=test
@set OPTIONS=-Dfile.encoding=UTF-8 -Dapp.home=%APP_HOME% -Djava.io.tmpdir=%APP_HOME%\temp -Duser.language=en -Duser.region=US
"%JAVA_HOME%\bin\java" %JVMOPTIONS% %DEBUG% -classpath %CLASSPATH% %OPTIONS% eu.loaders.starters.Main

cd %CURRENT_DIR%
@echo %APP_HOME%
pause