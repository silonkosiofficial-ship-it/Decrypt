.class abstract LP1/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Landroidx/datastore/preferences/protobuf/H;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Landroidx/datastore/preferences/protobuf/r0$b;->M:Landroidx/datastore/preferences/protobuf/r0$b;

    sget-object v1, Landroidx/datastore/preferences/protobuf/r0$b;->O:Landroidx/datastore/preferences/protobuf/r0$b;

    invoke-static {}, LP1/h;->Z()LP1/h;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Landroidx/datastore/preferences/protobuf/H;->d(Landroidx/datastore/preferences/protobuf/r0$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/r0$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/H;

    move-result-object v0

    sput-object v0, LP1/f$b;->a:Landroidx/datastore/preferences/protobuf/H;

    return-void
.end method
