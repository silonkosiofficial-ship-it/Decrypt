.class final LL7/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LL7/i$a;->a:I

    return-void
.end method


# virtual methods
.method public final a(LL7/i;LF7/k;)LO7/e;
    .locals 1

    const-string v0, "types"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LF7/b;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LN8/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget v0, p0, LL7/i$a;->a:I

    invoke-static {p1, p2, v0}, LL7/i;->a(LL7/i;Ljava/lang/String;I)LO7/e;

    move-result-object p1

    return-object p1
.end method
