.class public abstract Lf0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lf0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v0

    invoke-virtual {v0}, Lf0/k;->f()I

    move-result v0

    iput v0, p0, Lf0/A;->a:I

    return-void
.end method


# virtual methods
.method public abstract c(Lf0/A;)V
.end method

.method public abstract d()Lf0/A;
.end method

.method public final e()Lf0/A;
    .locals 1

    iget-object v0, p0, Lf0/A;->b:Lf0/A;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lf0/A;->a:I

    return v0
.end method

.method public final g(Lf0/A;)V
    .locals 0

    iput-object p1, p0, Lf0/A;->b:Lf0/A;

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lf0/A;->a:I

    return-void
.end method
