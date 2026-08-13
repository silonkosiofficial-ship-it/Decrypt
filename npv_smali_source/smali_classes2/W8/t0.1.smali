.class public final LW8/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW8/N;


# static fields
.field public static final C:LW8/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/t0;

    invoke-direct {v0}, LW8/t0;-><init>()V

    sput-object v0, LW8/t0;->C:LW8/t0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCoroutineContext()Lm7/i;
    .locals 1

    sget-object v0, Lm7/j;->C:Lm7/j;

    return-object v0
.end method
