.class final La9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e;


# static fields
.field public static final C:La9/r;

.field private static final D:Lm7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/r;

    invoke-direct {v0}, La9/r;-><init>()V

    sput-object v0, La9/r;->C:La9/r;

    sget-object v0, Lm7/j;->C:Lm7/j;

    sput-object v0, La9/r;->D:Lm7/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lm7/i;
    .locals 1

    sget-object v0, La9/r;->D:Lm7/i;

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
