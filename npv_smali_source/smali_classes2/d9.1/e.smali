.class public final Ld9/e;
.super Ld9/g;
.source "SourceFile"


# static fields
.field public static final a:Ld9/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld9/e;

    invoke-direct {v0}, Ld9/e;-><init>()V

    sput-object v0, Ld9/e;->a:Ld9/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld9/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
