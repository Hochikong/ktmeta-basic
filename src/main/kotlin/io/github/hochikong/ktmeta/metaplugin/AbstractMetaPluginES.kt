package io.github.hochikong.ktmeta.metaplugin

abstract class AbstractMetaPluginES : AbstractMetaPlugin() {
    /**
     * Export json data to ElasticSearch.
     * */
    abstract fun exportToES(documents: List<String>)
}