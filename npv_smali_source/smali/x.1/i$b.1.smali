.class public final Lx/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/i;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/i;


# direct methods
.method constructor <init>(Lx/i;)V
    .locals 0

    iput-object p1, p0, Lx/i$b;->a:Lx/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lx/i$b;->a:Lx/i;

    invoke-virtual {v0}, Lx/i;->d()Lx7/l;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
