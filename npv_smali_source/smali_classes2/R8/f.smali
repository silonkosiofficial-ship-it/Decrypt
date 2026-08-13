.class public final LR8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# instance fields
.field private final a:LR8/h;

.field private final b:Lx7/l;

.field private final c:Lx7/l;


# direct methods
.method public constructor <init>(LR8/h;Lx7/l;Lx7/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iterator"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/f;->a:LR8/h;

    iput-object p2, p0, LR8/f;->b:Lx7/l;

    iput-object p3, p0, LR8/f;->c:Lx7/l;

    return-void
.end method

.method public static final synthetic b(LR8/f;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR8/f;->c:Lx7/l;

    return-object p0
.end method

.method public static final synthetic c(LR8/f;)LR8/h;
    .locals 0

    iget-object p0, p0, LR8/f;->a:LR8/h;

    return-object p0
.end method

.method public static final synthetic d(LR8/f;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR8/f;->b:Lx7/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LR8/f$a;

    invoke-direct {v0, p0}, LR8/f$a;-><init>(LR8/f;)V

    return-object v0
.end method
