.class public LJ5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/a;


# static fields
.field private static a:LJ5/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()LJ5/b;
    .locals 1

    .prologue
    sget-object v0, LJ5/b;->a:LJ5/b;

    if-nez v0, :cond_0

    new-instance v0, LJ5/b;

    invoke-direct {v0}, LJ5/b;-><init>()V

    sput-object v0, LJ5/b;->a:LJ5/b;

    :cond_0
    sget-object v0, LJ5/b;->a:LJ5/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
