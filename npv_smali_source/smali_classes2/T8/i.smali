.class public final LT8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT8/i$a;
    }
.end annotation


# static fields
.field public static final a:LT8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT8/i;

    invoke-direct {v0}, LT8/i;-><init>()V

    sput-object v0, LT8/i;->a:LT8/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    sget-object v0, LT8/h;->a:LT8/h;

    invoke-virtual {v0}, LT8/h;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, LT8/h;->a:LT8/h;

    invoke-virtual {v0}, LT8/h;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
