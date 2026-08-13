.class public final Lh9/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lh9/j$b;

.field private static final b:Li9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh9/j$b;

    invoke-direct {v0}, Lh9/j$b;-><init>()V

    sput-object v0, Lh9/j$b;->a:Lh9/j$b;

    invoke-static {}, Li9/C;->b()Li9/B;

    move-result-object v0

    sput-object v0, Lh9/j$b;->b:Li9/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/n;
    .locals 1

    sget-object v0, Lh9/j$b;->b:Li9/n;

    return-object v0
.end method
