.class public final LM0/B$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/B;->a(Lx7/p;Lx7/l;)LM0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/p;

.field final synthetic b:Lx7/l;


# direct methods
.method constructor <init>(Lx7/p;Lx7/l;)V
    .locals 0

    iput-object p1, p0, LM0/B$u;->a:Lx7/p;

    iput-object p2, p0, LM0/B$u;->b:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM0/B$u;->b:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Le0/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM0/B$u;->a:Lx7/p;

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
