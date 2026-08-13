.class public final La9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# instance fields
.field private final C:LY8/C;


# direct methods
.method public constructor <init>(LY8/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/z;->C:LY8/C;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, La9/z;->C:LY8/C;

    invoke-interface {v0, p1, p2}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
