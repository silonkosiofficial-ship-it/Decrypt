.class public final LE8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LE8/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/k$a;

    invoke-direct {v0}, LE8/k$a;-><init>()V

    sput-object v0, LE8/k$a;->a:LE8/k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Lx7/l;)LE8/d;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance v0, LE8/c;

    invoke-direct {v0, p1, p2}, LE8/c;-><init>(Ljava/lang/Runnable;Lx7/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, LE8/d;

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-direct {v0, p2, p1, p2}, LE8/d;-><init>(Ljava/util/concurrent/locks/Lock;ILy7/k;)V

    :goto_0
    return-object v0
.end method
