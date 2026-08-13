.class final LK/a$b$a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a$b$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LK/l0;


# direct methods
.method constructor <init>(LK/l0;)V
    .locals 0

    iput-object p1, p0, LK/a$b$a$a$b;->C:LK/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, LK/a$b$a$a$b;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LK/a$b$a$a$b;->C:LK/l0;

    invoke-interface {p1}, LK/l0;->k()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
