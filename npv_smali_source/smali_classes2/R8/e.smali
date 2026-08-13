.class public final LR8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# instance fields
.field private final a:LR8/h;

.field private final b:Z

.field private final c:Lx7/l;


# direct methods
.method public constructor <init>(LR8/h;ZLx7/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8/e;->a:LR8/h;

    iput-boolean p2, p0, LR8/e;->b:Z

    iput-object p3, p0, LR8/e;->c:Lx7/l;

    return-void
.end method

.method public static final synthetic b(LR8/e;)Lx7/l;
    .locals 0

    iget-object p0, p0, LR8/e;->c:Lx7/l;

    return-object p0
.end method

.method public static final synthetic c(LR8/e;)Z
    .locals 0

    iget-boolean p0, p0, LR8/e;->b:Z

    return p0
.end method

.method public static final synthetic d(LR8/e;)LR8/h;
    .locals 0

    iget-object p0, p0, LR8/e;->a:LR8/h;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LR8/e$a;

    invoke-direct {v0, p0}, LR8/e$a;-><init>(LR8/e;)V

    return-object v0
.end method
