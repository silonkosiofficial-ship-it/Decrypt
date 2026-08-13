.class public final Ln1/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm1/e;Le1/d;I)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "system"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Ln1/o$b;->g:I

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Ln1/o$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Lm1/e;->L()Lm1/d;

    move-result-object p3

    invoke-virtual {p2, p3}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p3

    iput p3, p0, Ln1/o$b;->b:I

    invoke-virtual {p1}, Lm1/e;->c0()Lm1/d;

    move-result-object p3

    invoke-virtual {p2, p3}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p3

    iput p3, p0, Ln1/o$b;->c:I

    invoke-virtual {p1}, Lm1/e;->b0()Lm1/d;

    move-result-object p3

    invoke-virtual {p2, p3}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p3

    iput p3, p0, Ln1/o$b;->d:I

    invoke-virtual {p1}, Lm1/e;->G()Lm1/d;

    move-result-object p3

    invoke-virtual {p2, p3}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p3

    iput p3, p0, Ln1/o$b;->e:I

    invoke-virtual {p1}, Lm1/e;->F()Lm1/d;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/d;->B(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ln1/o$b;->f:I

    return-void
.end method
