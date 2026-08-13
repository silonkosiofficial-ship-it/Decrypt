.class public abstract Li7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Li7/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Li7/b;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(Li7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li7/d;

    invoke-virtual {p0}, Li7/a;->a()Lx7/q;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Li7/d;-><init>(Lx7/q;Ljava/lang/Object;)V

    invoke-virtual {v0}, Li7/d;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
