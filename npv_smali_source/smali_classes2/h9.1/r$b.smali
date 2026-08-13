.class public final Lh9/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lh9/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh9/r$b;

    invoke-direct {v0}, Lh9/r$b;-><init>()V

    sput-object v0, Lh9/r$b;->a:Lh9/r$b;

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

    invoke-static {}, Li9/X;->c()Li9/W;

    move-result-object v0

    return-object v0
.end method

.method public final b()Li9/n;
    .locals 1

    invoke-static {}, Li9/X;->d()Li9/W;

    move-result-object v0

    return-object v0
.end method

.method public final c()Li9/n;
    .locals 1

    invoke-static {}, Li9/X;->e()Li9/W;

    move-result-object v0

    return-object v0
.end method
