.class public final LO7/m0$i;
.super LO7/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final c:LO7/m0$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/m0$i;

    invoke-direct {v0}, LO7/m0$i;-><init>()V

    sput-object v0, LO7/m0$i;->c:LO7/m0$i;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "unknown"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LO7/n0;-><init>(Ljava/lang/String;Z)V

    return-void
.end method
