.class public final LR8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# instance fields
.field private final a:LR8/h;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(LR8/h;Lx7/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/w;->a:LR8/h;

    iput-object p2, p0, LR8/w;->b:Lx7/l;

    return-void
.end method

.method public static final synthetic b(LR8/w;)LR8/h;
    .locals 0

    iget-object p0, p0, LR8/w;->a:LR8/h;

    return-object p0
.end method

.method public static final synthetic c(LR8/w;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR8/w;->b:Lx7/l;

    return-object p0
.end method


# virtual methods
.method public final d(Lx7/l;)LR8/h;
    .locals 3

    const-string v0, "iterator"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/f;

    iget-object v1, p0, LR8/w;->a:LR8/h;

    iget-object v2, p0, LR8/w;->b:Lx7/l;

    invoke-direct {v0, v1, v2, p1}, LR8/f;-><init>(LR8/h;Lx7/l;Lx7/l;)V

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LR8/w$a;

    invoke-direct {v0, p0}, LR8/w$a;-><init>(LR8/w;)V

    return-object v0
.end method
