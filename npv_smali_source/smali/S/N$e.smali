.class public final LS/N$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/N;->k(LB/D;Lu/B;LV/n;II)Lx/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:Ly/i;


# direct methods
.method constructor <init>(Ly/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/N$e;->a:Ly/i;

    return-void
.end method


# virtual methods
.method public a(FF)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(F)F
    .locals 1

    iget-object v0, p0, LS/N$e;->a:Ly/i;

    invoke-interface {v0, p1}, Ly/i;->b(F)F

    move-result p1

    return p1
.end method
