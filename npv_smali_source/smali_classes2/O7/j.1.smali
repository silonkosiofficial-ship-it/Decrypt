.class public final LO7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO7/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/j;

    invoke-direct {v0}, LO7/j;-><init>()V

    sput-object v0, LO7/j;->a:LO7/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LF8/E;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LO7/k;->a(LF8/E;)Z

    move-result p0

    return p0
.end method
