.class final Ll0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/b;


# static fields
.field public static final C:Ll0/i;

.field private static final D:J

.field private static final E:LY0/v;

.field private static final F:LY0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll0/i;

    invoke-direct {v0}, Ll0/i;-><init>()V

    sput-object v0, Ll0/i;->C:Ll0/i;

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->a()J

    move-result-wide v0

    sput-wide v0, Ll0/i;->D:J

    sget-object v0, LY0/v;->C:LY0/v;

    sput-object v0, Ll0/i;->E:LY0/v;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, LY0/g;->a(FF)LY0/e;

    move-result-object v0

    sput-object v0, Ll0/i;->F:LY0/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDensity()LY0/e;
    .locals 1

    sget-object v0, Ll0/i;->F:LY0/e;

    return-object v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    sget-object v0, Ll0/i;->E:LY0/v;

    return-object v0
.end method

.method public i()J
    .locals 2

    sget-wide v0, Ll0/i;->D:J

    return-wide v0
.end method
