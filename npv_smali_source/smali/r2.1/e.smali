.class public abstract Lr2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/e$a;,
        Lr2/e$b;,
        Lr2/e$c;
    }
.end annotation


# static fields
.field public static final d:Lr2/e$a;


# instance fields
.field private final a:Lz2/d;

.field private final b:Ljava/lang/String;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr2/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lr2/e;->d:Lr2/e$a;

    return-void
.end method

.method private constructor <init>(Lz2/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/e;->a:Lz2/d;

    iput-object p2, p0, Lr2/e;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lz2/d;Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr2/e;-><init>(Lz2/d;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final b()Lz2/d;
    .locals 1

    iget-object v0, p0, Lr2/e;->a:Lz2/d;

    return-object v0
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr2/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected final d()Z
    .locals 1

    iget-boolean v0, p0, Lr2/e;->c:Z

    return v0
.end method

.method protected final e(Z)V
    .locals 0

    iput-boolean p1, p0, Lr2/e;->c:Z

    return-void
.end method

.method protected final f()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lr2/e;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x15

    const-string v1, "statement is closed"

    invoke-static {v0, v1}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public synthetic getInt(I)I
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->b(Ly2/e;I)I

    move-result p1

    return p1
.end method

.method public synthetic m(I)Z
    .locals 0

    invoke-static {p0, p1}, Ly2/d;->a(Ly2/e;I)Z

    move-result p1

    return p1
.end method
