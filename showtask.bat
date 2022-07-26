call runcrud
if "%ERRORLEVEL%" == "0" goto gettasks
echo runcrud.bat has errors - breaking work
goto fail

:gettasks
start chrome "http://localhost:8080/v1/tasks"
if "%ERRORLEVEL%" == "0" goto end
echo Can't open browser - breaking work
goto fail

:fail
echo There were errors

:end
echo Work is finished.