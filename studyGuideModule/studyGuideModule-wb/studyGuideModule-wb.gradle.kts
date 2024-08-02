/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

import com.tridium.gradle.plugins.module.util.ModulePart.RuntimeProfile.*

plugins {
  // The Niagara Module plugin configures the "moduleManifest" extension and the
  // "jar" and "moduleTestJar" tasks.
  id("com.tridium.niagara-module")

  // The signing plugin configures the correct signing of modules. It requires
  // that the plugin also be applied to the root project.
  id("com.tridium.niagara-signing")

  // The bajadoc plugin configures the generation of Bajadoc for a module.
  id("com.tridium.bajadoc")

  // Configures JaCoCo for the "niagaraTest" task of this module.
  id("com.tridium.niagara-jacoco")

  // The Annotation processors plugin adds default dependencies on "Tridium:nre"
  // for the "annotationProcessor" and "moduleTestAnnotationProcessor"
  // configurations by creating a single "niagaraAnnotationProcessor"
  // configuration they extend from. This value can be overridden by explicitly
  // declaring a dependency for the "niagaraAnnotationProcessor" configuration.
  id("com.tridium.niagara-annotation-processors")

  // The niagara_home repositories convention plugin configures !bin/ext and
  // !modules as flat-file Maven repositories so that projects in this build can
  // depend on already-installed Niagara modules.
  id("com.tridium.convention.niagara-home-repositories")
}

description = "This module create along the Study Guide Modules and Components"

moduleManifest {
  moduleName.set("studyGuideModule")
  runtimeProfile.set(wb)
}

// See documentation at module://docDeveloper/doc/build.html#dependencies for the supported
// dependency types
dependencies {
  // NRE dependencies
  nre("Tridium:nre")

  // Niagara module dependencies
  api("Tridium:aaphp-rt")
  api("Tridium:aaphp-wb")
  api("Tridium:aapup-rt")
  api("Tridium:aapup-wb")
  api("Tridium:abstractMqttDriver-rt")
  api("Tridium:abstractMqttDriver-wb")
  api("Tridium:ace-rt")
  api("Tridium:ace-ux")
  api("Tridium:ace-wb")
  api("Tridium:aceEdge-rt")
  api("Tridium:aceEdge-wb")
  api("Tridium:alarm-rt")
  api("Tridium:alarm-ux")
  api("Tridium:alarm-wb")
  api("Tridium:alarmOrion-rt")
  api("Tridium:analytics-lib-ux")
  api("Tridium:analytics-rt")
  api("Tridium:analytics-ux")
  api("Tridium:analytics-wb")
  api("Tridium:andoverAC256-rt")
  api("Tridium:andoverAC256-wb")
  api("Tridium:andoverInfinity-rt")
  api("Tridium:andoverInfinity-wb")
  api("Tridium:apachePoi-rt")
  api("Tridium:app-rt")
  api("Tridium:app-wb")
  api("Tridium:awsUtils-rt")
  api("Tridium:awsUtils-ux")
  api("Tridium:awsUtils-wb")
  api("Tridium:axvelocity-rt")
  api("Tridium:axvelocity-wb")
  api("Tridium:azureUtils-rt")
  api("Tridium:backup-rt")
  api("Tridium:backup-wb")
  api("Tridium:bacnet-rt")
  api("Tridium:bacnet-ux")
  api("Tridium:bacnet-wb")
  api("Tridium:bacnetAws-rt")
  api("Tridium:bacnetAws-ux")
  api("Tridium:bacnetAws-wb")
  api("Tridium:bacnetEDE-wb")
  api("Tridium:bacnetMigrator-wb")
  api("Tridium:bacnetOws-rt")
  api("Tridium:bacnetOws-ux")
  api("Tridium:bacnetOws-wb")
  api("Tridium:bacnetUtil-rt")
  api("Tridium:baja")
  api("Tridium:bajaScript-ux")
  api("Tridium:bajaui-ux")
  api("Tridium:bajaui-wb")
  api("Tridium:bajaux-rt")
  api("Tridium:bajaux-ux")
  api("Tridium:baseRtsp-rt")
  api("Tridium:basicDriver-rt")
  api("Tridium:batchJob-rt")
  api("Tridium:batchJob-wb")
  api("Tridium:box-rt")
  api("Tridium:boxAnalyzer-rt")
  api("Tridium:boxAnalyzer-wb")
  api("Tridium:bql-rt")
  api("Tridium:bql-ux")
  api("Tridium:ccn-rt")
  api("Tridium:ccn-wb")
  api("Tridium:chart-rt")
  api("Tridium:chart-wb")
  api("Tridium:clientCertAuth-rt")
  api("Tridium:clientCertAuth-ux")
  api("Tridium:clientCertAuth-wb")
  api("Tridium:cloudBackup-rt")
  api("Tridium:cloudBackup-ux")
  api("Tridium:cloudBackup-wb")
  api("Tridium:cloudConfig-rt")
  api("Tridium:cloudConnector-rt")
  api("Tridium:cloudIotHubConnector-rt")
  api("Tridium:cloudIotHubDep-rt")
  api("Tridium:cloudSentienceConnector-rt")
  api("Tridium:cloudSentienceConnector-ux")
  api("Tridium:commonsCompress-rt")
  api("Tridium:commonsIo-rt")
  api("Tridium:commonsLang-rt")
  api("Tridium:control-rt")
  api("Tridium:control-ux")
  api("Tridium:control-wb")
  api("Tridium:converters-rt")
  api("Tridium:converters-ux")
  api("Tridium:csmgrbase-rt")
  api("Tridium:dashboard-rt")
  api("Tridium:dashboard-ux")
  api("Tridium:dashboard-wb")
  api("Tridium:devDriver-rt")
  api("Tridium:devDriver-wb")
  api("Tridium:devHttpDriver-rt")
  api("Tridium:devIpDriver-rt")
  api("Tridium:devIpDriver-wb")
  api("Tridium:devSerialDriver-rt")
  api("Tridium:devkit-wb")
  api("Tridium:docDeveloper-rt")
  api("Tridium:docDeveloper-ux")
  api("Tridium:driver-rt")
  api("Tridium:driver-ux")
  api("Tridium:driver-wb")
  api("Tridium:driverUpgrade-wb")
  api("Tridium:edgeIo-rt")
  api("Tridium:edgeIo-wb")
  api("Tridium:email-rt")
  api("Tridium:email-ux")
  api("Tridium:email-wb")
  api("Tridium:entityIo-rt")
  api("Tridium:event-rt")
  api("Tridium:event-wb")
  api("Tridium:export-rt")
  api("Tridium:export-ux")
  api("Tridium:export-wb")
  api("Tridium:exportTags-rt")
  api("Tridium:exportTags-wb")
  api("Tridium:fcEasyOnboard-rt")
  api("Tridium:fcModelSync-rt")
  api("Tridium:fcModelSyncBacnet-rt")
  api("Tridium:fcModelSyncNiagara-rt")
  api("Tridium:fcTagDict-rt")
  api("Tridium:ffmpeg-rt")
  api("Tridium:ffmpeg-wb")
  api("Tridium:file-rt")
  api("Tridium:flexSerial-rt")
  api("Tridium:flexSerial-wb")
  api("Tridium:fonts-rt")
  api("Tridium:fox-rt")
  api("Tridium:fox-ux")
  api("Tridium:gauth-rt")
  api("Tridium:gauth-ux")
  api("Tridium:gauth-wb")
  api("Tridium:gx-rt")
  api("Tridium:gx-ux")
  api("Tridium:gx-wb")
  api("Tridium:haystack-rt")
  api("Tridium:hdk8000-rt")
  api("Tridium:help-wb")
  api("Tridium:hierarchy-rt")
  api("Tridium:hierarchy-ux")
  api("Tridium:hierarchy-wb")
  api("Tridium:history-rt")
  api("Tridium:history-ux")
  api("Tridium:history-wb")
  api("Tridium:html-wb")
  api("Tridium:httpClient-rt")
  api("Tridium:httpClient-ux")
  api("Tridium:httpClient-wb")
  api("Tridium:hx-wb")
  api("Tridium:icons-ux")
  api("Tridium:jetty-rt")
  api("Tridium:js-ux")
  api("Tridium:jsonSmart-rt")
  api("Tridium:jsonToolkit-rt")
  api("Tridium:jsonToolkit-ux")
  api("Tridium:jsonToolkit-wb")
  api("Tridium:jxBrowser-wb")
  api("Tridium:kitControl-rt")
  api("Tridium:kitControl-ux")
  api("Tridium:kitControl-wb")
  api("Tridium:kitIo-rt")
  api("Tridium:kitIo-ux")
  api("Tridium:kitIo-wb")
  api("Tridium:kitLon-rt")
  api("Tridium:kitPx-ux")
  api("Tridium:kitPx-wb")
  api("Tridium:kitPxGraphics-wb")
  api("Tridium:kitPxHvac-wb")
  api("Tridium:kitPxN4svg-wb")
  api("Tridium:ldap-rt")
  api("Tridium:ldap-ux")
  api("Tridium:ldap-wb")
  api("Tridium:lonAaon-rt")
  api("Tridium:lonAbb-rt")
  api("Tridium:lonAct-rt")
  api("Tridium:lonActech-rt")
  api("Tridium:lonAcutherm-rt")
  api("Tridium:lonAerco-rt")
  api("Tridium:lonAirtest-rt")
  api("Tridium:lonAlco-rt")
  api("Tridium:lonAlya-rt")
  api("Tridium:lonAndover-rt")
  api("Tridium:lonApice-rt")
  api("Tridium:lonAr2I-rt")
  api("Tridium:lonAtt-rt")
  api("Tridium:lonBapi-rt")
  api("Tridium:lonBelimo-rt")
  api("Tridium:lonBellGossett-rt")
  api("Tridium:lonBircher-rt")
  api("Tridium:lonBrunata-rt")
  api("Tridium:lonBtr-rt")
  api("Tridium:lonCalon-rt")
  api("Tridium:lonCapelon-rt")
  api("Tridium:lonCarel-rt")
  api("Tridium:lonCarrier-rt")
  api("Tridium:lonCcs-rt")
  api("Tridium:lonCeag-rt")
  api("Tridium:lonCiac-rt")
  api("Tridium:lonCircon-rt")
  api("Tridium:lonCircon2-rt")
  api("Tridium:lonClimaCool-rt")
  api("Tridium:lonCommtec-rt")
  api("Tridium:lonComputec-rt")
  api("Tridium:lonCompwell-rt")
  api("Tridium:lonComtec-rt")
  api("Tridium:lonConnectbv-rt")
  api("Tridium:lonContcontrol-rt")
  api("Tridium:lonControlTechniques-rt")
  api("Tridium:lonControlsolutions-rt")
  api("Tridium:lonCpc-rt")
  api("Tridium:lonCristal-rt")
  api("Tridium:lonCsi-rt")
  api("Tridium:lonCummins-rt")
  api("Tridium:lonDaikin-rt")
  api("Tridium:lonDanfoss-rt")
  api("Tridium:lonDataaire-rt")
  api("Tridium:lonDelmatic-rt")
  api("Tridium:lonDistech-rt")
  api("Tridium:lonDouglas-rt")
  api("Tridium:lonDristeem-rt")
  api("Tridium:lonDynalite-rt")
  api("Tridium:lonEbtron-rt")
  api("Tridium:lonEchelon-rt")
  api("Tridium:lonElectronicsysusa-rt")
  api("Tridium:lonElka-rt")
  api("Tridium:lonElm-rt")
  api("Tridium:lonEmon-rt")
  api("Tridium:lonEnergyControlSystems-rt")
  api("Tridium:lonEsmi-rt")
  api("Tridium:lonEurotherm-rt")
  api("Tridium:lonExhausto-rt")
  api("Tridium:lonFieldServer-rt")
  api("Tridium:lonFloridaHeatPumps-rt")
  api("Tridium:lonFunctionaldevices-rt")
  api("Tridium:lonGe-rt")
  api("Tridium:lonGmc-rt")
  api("Tridium:lonGraham-rt")
  api("Tridium:lonGrundfos-rt")
  api("Tridium:lonHelvar-rt")
  api("Tridium:lonHillrom-rt")
  api("Tridium:lonHitachi-rt")
  api("Tridium:lonHoneywell-rt")
  api("Tridium:lonHoneywellAnalytics-rt")
  api("Tridium:lonHoneywellVacon-rt")
  api("Tridium:lonHoneywellXfl800-rt")
  api("Tridium:lonHoneywellXfl800-wb")
  api("Tridium:lonHoneywellio-rt")
  api("Tridium:lonHorton-rt")
  api("Tridium:lonHubbell-rt")
  api("Tridium:lonIdec-rt")
  api("Tridium:lonIndala-rt")
  api("Tridium:lonInnovent-rt")
  api("Tridium:lonIp-rt")
  api("Tridium:lonIp-wb")
  api("Tridium:lonIsh-rt")
  api("Tridium:lonItgworldwide-rt")
  api("Tridium:lonIzumi-rt")
  api("Tridium:lonJanitza-rt")
  api("Tridium:lonJohnson-rt")
  api("Tridium:lonJrs-rt")
  api("Tridium:lonKamstrup-rt")
  api("Tridium:lonKawasaki-rt")
  api("Tridium:lonKele-rt")
  api("Tridium:lonKhi-rt")
  api("Tridium:lonKiebackpeter-rt")
  api("Tridium:lonKlon-rt")
  api("Tridium:lonLakewood-rt")
  api("Tridium:lonLennox-rt")
  api("Tridium:lonLeviton-rt")
  api("Tridium:lonLexel-rt")
  api("Tridium:lonLg-rt")
  api("Tridium:lonLiebert-rt")
  api("Tridium:lonLochinvar-rt")
  api("Tridium:lonLonix-rt")
  api("Tridium:lonLoras-rt")
  api("Tridium:lonLsis-rt")
  api("Tridium:lonLuxonic-rt")
  api("Tridium:lonLynxspring-rt")
  api("Tridium:lonMagnetek-rt")
  api("Tridium:lonMarubeni-rt")
  api("Tridium:lonMatsushita-rt")
  api("Tridium:lonMatsushitaVavlesst-rt")
  api("Tridium:lonMenerga-rt")
  api("Tridium:lonMetrawatt-rt")
  api("Tridium:lonMiEnvir-rt")
  api("Tridium:lonMicrometl-rt")
  api("Tridium:lonMicrotech-rt")
  api("Tridium:lonMicrotechII-rt")
  api("Tridium:lonMicrotechIII-rt")
  api("Tridium:lonMitsubishi-rt")
  api("Tridium:lonMoore-rt")
  api("Tridium:lonMotivar-rt")
  api("Tridium:lonMsa-rt")
  api("Tridium:lonMsr-rt")
  api("Tridium:lonNico-rt")
  api("Tridium:lonNilan-rt")
  api("Tridium:lonNr-rt")
  api("Tridium:lonOjair-rt")
  api("Tridium:lonOmron-rt")
  api("Tridium:lonOnan-rt")
  api("Tridium:lonOnicon-rt")
  api("Tridium:lonOntrol-rt")
  api("Tridium:lonOrion-rt")
  api("Tridium:lonOuman-rt")
  api("Tridium:lonPentacontrol-rt")
  api("Tridium:lonPeweng-rt")
  api("Tridium:lonPhilips-rt")
  api("Tridium:lonPhoenix-rt")
  api("Tridium:lonPhoenixCeleris2-rt")
  api("Tridium:lonPmluft-rt")
  api("Tridium:lonProlon-rt")
  api("Tridium:lonPurechoice-rt")
  api("Tridium:lonQuantumAutomation-rt")
  api("Tridium:lonRaypak-rt")
  api("Tridium:lonReko-rt")
  api("Tridium:lonRetech-rt")
  api("Tridium:lonReznor-rt")
  api("Tridium:lonRichardszeta-rt")
  api("Tridium:lonRockwell-rt")
  api("Tridium:lonSanyo-rt")
  api("Tridium:lonSauter-rt")
  api("Tridium:lonSchneider-rt")
  api("Tridium:lonSeefar-rt")
  api("Tridium:lonSemco-rt")
  api("Tridium:lonSenseair-rt")
  api("Tridium:lonServisys-rt")
  api("Tridium:lonSiebe-rt")
  api("Tridium:lonSiemens-rt")
  api("Tridium:lonSiemensLandis-rt")
  api("Tridium:lonSilentgliss-rt")
  api("Tridium:lonSmartcontrols-rt")
  api("Tridium:lonSolidyne-rt")
  api("Tridium:lonSomfy-rt")
  api("Tridium:lonSontay-rt")
  api("Tridium:lonSontex-rt")
  api("Tridium:lonSpega-rt")
  api("Tridium:lonSquared-rt")
  api("Tridium:lonStaefa-rt")
  api("Tridium:lonStanilite-rt")
  api("Tridium:lonStulz-rt")
  api("Tridium:lonSurfNetworks-rt")
  api("Tridium:lonSvea-rt")
  api("Tridium:lonSysmik-rt")
  api("Tridium:lonTac-rt")
  api("Tridium:lonTeco-rt")
  api("Tridium:lonTelda-rt")
  api("Tridium:lonThermokon-rt")
  api("Tridium:lonTitan-rt")
  api("Tridium:lonToshiba-rt")
  api("Tridium:lonTrane-rt")
  api("Tridium:lonTrend-rt")
  api("Tridium:lonTriatek-rt")
  api("Tridium:lonTridonic-rt")
  api("Tridium:lonTrox-rt")
  api("Tridium:lonTsi-rt")
  api("Tridium:lonUnitro-rt")
  api("Tridium:lonUnknown-rt")
  api("Tridium:lonVacom-rt")
  api("Tridium:lonVaisalaoy-rt")
  api("Tridium:lonVeris-rt")
  api("Tridium:lonViconics-rt")
  api("Tridium:lonViessman-rt")
  api("Tridium:lonVykonStat-rt")
  api("Tridium:lonWago-rt")
  api("Tridium:lonWatanabe-rt")
  api("Tridium:lonWattStopper-rt")
  api("Tridium:lonWccc-rt")
  api("Tridium:lonWestParkMob-rt")
  api("Tridium:lonWfiGlobal-rt")
  api("Tridium:lonWfiMinnesota-rt")
  api("Tridium:lonWilo-rt")
  api("Tridium:lonWps-rt")
  api("Tridium:lonYamatake-rt")
  api("Tridium:lonYaskawa-rt")
  api("Tridium:lonYokogawa-rt")
  api("Tridium:lonYork-rt")
  api("Tridium:lonZener-rt")
  api("Tridium:lonZytron-rt")
  api("Tridium:lontunnel-rt")
  api("Tridium:lonworks-rt")
  api("Tridium:lonworks-ux")
  api("Tridium:lonworks-wb")
  api("Tridium:maxpro-rt")
  api("Tridium:maxpro-ux")
  api("Tridium:maxpro-wb")
  api("Tridium:mbus-rt")
  api("Tridium:mbus-wb")
  api("Tridium:mcquay-rt")
  api("Tridium:mcquay-wb")
  api("Tridium:migration-rt")
  api("Tridium:migrator-wb")
  api("Tridium:mobile-ux")
  api("Tridium:mobile-wb")
  api("Tridium:mobileThemeZebra-ux")
  api("Tridium:modbusAsync-rt")
  api("Tridium:modbusAsync-wb")
  api("Tridium:modbusCore-rt")
  api("Tridium:modbusCore-wb")
  api("Tridium:modbusSlave-rt")
  api("Tridium:modbusSlave-wb")
  api("Tridium:modbusTcp-rt")
  api("Tridium:modbusTcp-wb")
  api("Tridium:modbusTcpSlave-rt")
  api("Tridium:modbusTcpSlave-wb")
  api("Tridium:modbusTcpSlaveMigrator-wb")
  api("Tridium:nCloudDriver-rt")
  api("Tridium:nCloudDriver-wb")
  api("Tridium:nSnmp-rt")
  api("Tridium:nSnmp-wb")
  api("Tridium:naxisVideo-rt")
  api("Tridium:naxisVideo-ux")
  api("Tridium:naxisVideo-wb")
  api("Tridium:ndio-rt")
  api("Tridium:ndio-ux")
  api("Tridium:ndio-wb")
  api("Tridium:ndriver-rt")
  api("Tridium:ndriver-ux")
  api("Tridium:ndriver-wb")
  api("Tridium:neql-rt")
  api("Tridium:net-rt")
  api("Tridium:niagaraDriver-rt")
  api("Tridium:niagaraDriver-ux")
  api("Tridium:niagaraDriver-wb")
  api("Tridium:niagaraLexiconAl-rt")
  api("Tridium:niagaraLexiconAr-rt")
  api("Tridium:niagaraLexiconBe-rt")
  api("Tridium:niagaraLexiconBg-rt")
  api("Tridium:niagaraLexiconCa-rt")
  api("Tridium:niagaraLexiconCs-rt")
  api("Tridium:niagaraLexiconDa-rt")
  api("Tridium:niagaraLexiconDe-rt")
  api("Tridium:niagaraLexiconEl-rt")
  api("Tridium:niagaraLexiconEs-rt")
  api("Tridium:niagaraLexiconEt-rt")
  api("Tridium:niagaraLexiconFi-rt")
  api("Tridium:niagaraLexiconFr-rt")
  api("Tridium:niagaraLexiconHi-rt")
  api("Tridium:niagaraLexiconHr-rt")
  api("Tridium:niagaraLexiconHu-rt")
  api("Tridium:niagaraLexiconIn-rt")
  api("Tridium:niagaraLexiconIs-rt")
  api("Tridium:niagaraLexiconIt-rt")
  api("Tridium:niagaraLexiconIw-rt")
  api("Tridium:niagaraLexiconJa-rt")
  api("Tridium:niagaraLexiconKo-rt")
  api("Tridium:niagaraLexiconLt-rt")
  api("Tridium:niagaraLexiconLv-rt")
  api("Tridium:niagaraLexiconMk-rt")
  api("Tridium:niagaraLexiconNl-rt")
  api("Tridium:niagaraLexiconNo-rt")
  api("Tridium:niagaraLexiconPl-rt")
  api("Tridium:niagaraLexiconPt-rt")
  api("Tridium:niagaraLexiconRo-rt")
  api("Tridium:niagaraLexiconRu-rt")
  api("Tridium:niagaraLexiconSk-rt")
  api("Tridium:niagaraLexiconSl-rt")
  api("Tridium:niagaraLexiconSq-rt")
  api("Tridium:niagaraLexiconSr-rt")
  api("Tridium:niagaraLexiconSv-rt")
  api("Tridium:niagaraLexiconTh-rt")
  api("Tridium:niagaraLexiconTr-rt")
  api("Tridium:niagaraLexiconUk-rt")
  api("Tridium:niagaraLexiconVi-rt")
  api("Tridium:niagaraLexiconZh-rt")
  api("Tridium:niagaraLexiconZhcn-rt")
  api("Tridium:niagaraSystemIndex-rt")
  api("Tridium:niagaraSystemIndex-ux")
  api("Tridium:niagaraSystemIndex-wb")
  api("Tridium:niagaraVirtual-rt")
  api("Tridium:niagaraVirtual-wb")
  api("Tridium:nmilestone-rt")
  api("Tridium:nmilestone-wb")
  api("Tridium:nrio-rt")
  api("Tridium:nrio-ux")
  api("Tridium:nrio-wb")
  api("Tridium:nrioConversion-wb")
  api("Tridium:nsh-wb")
  api("Tridium:nss-rt")
  api("Tridium:nss-ux")
  api("Tridium:nss-wb")
  api("Tridium:nvideo-rt")
  api("Tridium:nvideo-wb")
  api("Tridium:oauth2-rt")
  api("Tridium:obix-rt")
  api("Tridium:obixDriver-rt")
  api("Tridium:obixDriver-wb")
  api("Tridium:obixMigrator-wb")
  api("Tridium:obixSeriesTransform-rt")
  api("Tridium:onCall-rt")
  api("Tridium:onCall-wb")
  api("Tridium:opc-rt")
  api("Tridium:opc-wb")
  api("Tridium:opcUaClient-rt")
  api("Tridium:opcUaClient-wb")
  api("Tridium:opcUaCore-rt")
  api("Tridium:opcUaServer-rt")
  api("Tridium:opcUaServer-wb")
  api("Tridium:orion-rt")
  api("Tridium:orion-wb")
  api("Tridium:pdf-wb")
  api("Tridium:platAceIpc-rt")
  api("Tridium:platBacnet-rt")
  api("Tridium:platCcn-rt")
  api("Tridium:platCrypto-rt")
  api("Tridium:platCrypto-ux")
  api("Tridium:platCrypto-wb")
  api("Tridium:platDaemon-rt")
  api("Tridium:platDaemon-wb")
  api("Tridium:platDataRecovery-rt")
  api("Tridium:platDataRecovery-wb")
  api("Tridium:platEdgeIo-rt")
  api("Tridium:platHwScan-rt")
  api("Tridium:platHwScan-wb")
  api("Tridium:platHwScanJ603-rt")
  api("Tridium:platHwScanJ603-wb")
  api("Tridium:platHwScanJ645-rt")
  api("Tridium:platHwScanJ645-wb")
  api("Tridium:platHwScanJvln-rt")
  api("Tridium:platHwScanJvln-wb")
  api("Tridium:platHwScanNpm-rt")
  api("Tridium:platHwScanNpm-wb")
  api("Tridium:platHwScanSec-rt")
  api("Tridium:platHwScanSec-wb")
  api("Tridium:platHwScanTitan-rt")
  api("Tridium:platHwScanTitan-wb")
  api("Tridium:platHwScanXpr-rt")
  api("Tridium:platHwScanXpr-wb")
  api("Tridium:platIEEE8021X-rt")
  api("Tridium:platIEEE8021X-wb")
  api("Tridium:platLon-rt")
  api("Tridium:platMstp-rt")
  api("Tridium:platNdio-rt")
  api("Tridium:platNrio-rt")
  api("Tridium:platPower-rt")
  api("Tridium:platPower-wb")
  api("Tridium:platSerial-rt")
  api("Tridium:platSerialNpsdk-rt")
  api("Tridium:platSerialQnx-rt")
  api("Tridium:platWifi-rt")
  api("Tridium:platWifi-wb")
  api("Tridium:platform-rt")
  api("Tridium:platform-wb")
  api("Tridium:portalApi-rt")
  api("Tridium:portalApi-wb")
  api("Tridium:program-rt")
  api("Tridium:program-wb")
  api("Tridium:propMigration-wb")
  api("Tridium:provisioningNiagara-ux")
  api("Tridium:provisioningNiagara-wb")
  api("Tridium:pxEditor-wb")
  api("Tridium:query-rt")
  api("Tridium:queryTable-wb")
  api("Tridium:raster-wb")
  api("Tridium:rdb-rt")
  api("Tridium:rdb-wb")
  api("Tridium:rdbHsqlDb-rt")
  api("Tridium:rdbMySQL-rt")
  api("Tridium:rdbMySQL-wb")
  api("Tridium:rdbOracle-rt")
  api("Tridium:rdbOracle-wb")
  api("Tridium:rdbSqlServer-rt")
  api("Tridium:rdbSqlServer-wb")
  api("Tridium:remoteVideo-rt")
  api("Tridium:remoteVideo-wb")
  api("Tridium:report-rt")
  api("Tridium:report-ux")
  api("Tridium:report-wb")
  api("Tridium:saml-rt")
  api("Tridium:saml-ux")
  api("Tridium:saml-wb")
  api("Tridium:samlEncryption-rt")
  api("Tridium:schedule-rt")
  api("Tridium:schedule-ux")
  api("Tridium:schedule-wb")
  api("Tridium:search-rt")
  api("Tridium:search-ux")
  api("Tridium:search-wb")
  api("Tridium:serial-rt")
  api("Tridium:serial-wb")
  api("Tridium:seriesTransform-rt")
  api("Tridium:seriesTransform-ux")
  api("Tridium:seriesTransform-wb")
  api("Tridium:signingService-rt")
  api("Tridium:signingService-ux")
  api("Tridium:signingService-wb")
  api("Tridium:silk-rt")
  api("Tridium:smartTableHx-wb")
  api("Tridium:sms-rt")
  api("Tridium:sms-wb")
  api("Tridium:snmp-rt")
  api("Tridium:snmp-wb")
  api("Tridium:snmpLibs-wb")
  api("Tridium:snmpMigrator-wb")
  api("Tridium:svg-wb")
  api("Tridium:svgBatik-wb")
  api("Tridium:systemDb-rt")
  api("Tridium:systemIndex-rt")
  api("Tridium:systemMonitor-rt")
  api("Tridium:systemMonitor-wb")
  api("Tridium:tagdictionary-rt")
  api("Tridium:tagdictionary-ux")
  api("Tridium:tagdictionary-wb")
  api("Tridium:template-rt")
  api("Tridium:template-wb")
  api("Tridium:templateBulk-rt")
  api("Tridium:test-wb")
  api("Tridium:themeLucid-ux")
  api("Tridium:themeZebra-ux")
  api("Tridium:tls-rt")
  api("Tridium:tls-wb")
  api("Tridium:tunnel-rt")
  api("Tridium:uxBuilder-ux")
  api("Tridium:uxBuilder-wb")
  api("Tridium:videoDriver-rt")
  api("Tridium:videoDriver-ux")
  api("Tridium:videoDriver-wb")
  api("Tridium:videoMigrator-wb")
  api("Tridium:wbutil-wb")
  api("Tridium:weather-rt")
  api("Tridium:weather-wb")
  api("Tridium:weatherUnderground-rt")
  api("Tridium:web-rt")
  api("Tridium:webChart-rt")
  api("Tridium:webChart-ux")
  api("Tridium:webEditors-ux")
  api("Tridium:wiresheet-ux")
  api("Tridium:wiresheet-wb")
  api("Tridium:workbench-wb")
  api("Tridium:xprotect-ux")
  api("Tridium:xprotect-wb")

  // Test Niagara module dependencies
  moduleTestImplementation("Tridium:test-wb")
}

