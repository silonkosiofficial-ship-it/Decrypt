.class public abstract LA9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LA9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, LA9/a;

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v1

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v2

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v3

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LA9/a;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V

    sput-object v7, LA9/e;->a:LA9/b;

    return-void
.end method

.method public static final a()LA9/b;
    .locals 1

    sget-object v0, LA9/e;->a:LA9/b;

    return-object v0
.end method
