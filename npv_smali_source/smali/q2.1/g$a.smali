.class public final Lq2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq2/g;->a(Lo2/n;Z[Ljava/lang/String;Lx7/l;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/f;

.field final synthetic D:Lo2/n;

.field final synthetic E:Z

.field final synthetic F:Lx7/l;


# direct methods
.method public constructor <init>(LZ8/f;Lo2/n;ZLx7/l;)V
    .locals 0

    iput-object p1, p0, Lq2/g$a;->C:LZ8/f;

    iput-object p2, p0, Lq2/g$a;->D:Lo2/n;

    iput-boolean p3, p0, Lq2/g$a;->E:Z

    iput-object p4, p0, Lq2/g$a;->F:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    iget-object v0, p0, Lq2/g$a;->C:LZ8/f;

    new-instance v1, Lq2/g$a$a;

    iget-object v2, p0, Lq2/g$a;->D:Lo2/n;

    iget-boolean v3, p0, Lq2/g$a;->E:Z

    iget-object v4, p0, Lq2/g$a;->F:Lx7/l;

    invoke-direct {v1, p1, v2, v3, v4}, Lq2/g$a$a;-><init>(LZ8/g;Lo2/n;ZLx7/l;)V

    invoke-interface {v0, v1, p2}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
