/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */
package io.airbyte.integrations.destination.snowflake

import io.airbyte.cdk.db.jdbc.JdbcDatabase
import io.airbyte.cdk.integrations.base.JavaBaseConstants
import io.airbyte.cdk.integrations.destination.record_buffer.FileBuffer
import io.airbyte.cdk.integrations.destination.s3.csv.CsvSerializedBuffer
import io.airbyte.cdk.integrations.destination.s3.csv.StagingDatabaseCsvSheetGenerator
import io.airbyte.cdk.integrations.destination.staging.StagingOperations
import io.airbyte.commons.json.Jsons.jsonNode
import io.airbyte.protocol.models.v0.AirbyteRecordMessage

abstract class SnowflakeSqlStagingOperations : SnowflakeSqlOperations() {
}
