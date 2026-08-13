.class public final LP1/g$a;
.super Landroidx/datastore/preferences/protobuf/w$a;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LP1/g;->N()LP1/g;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/w$a;-><init>(Landroidx/datastore/preferences/protobuf/w;)V

    return-void
.end method

.method synthetic constructor <init>(LP1/e;)V
    .locals 0

    invoke-direct {p0}, LP1/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public u(Ljava/lang/Iterable;)LP1/g$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->n()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->D:Landroidx/datastore/preferences/protobuf/w;

    check-cast v0, LP1/g;

    invoke-static {v0, p1}, LP1/g;->O(LP1/g;Ljava/lang/Iterable;)V

    return-object p0
.end method
