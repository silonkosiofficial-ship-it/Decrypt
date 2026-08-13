.class public final LF0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:I


# instance fields
.field private final a:LX/b;

.field private final b:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LX/b;->F:I

    sput v0, LF0/Y;->c:I

    return-void
.end method

.method public constructor <init>(LX/b;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/Y;->a:LX/b;

    iput-object p2, p0, LF0/Y;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0, p1, p2}, LX/b;->a(ILjava/lang/Object;)V

    iget-object p1, p0, LF0/Y;->b:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0}, LX/b;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0}, LX/b;->j()V

    iget-object v0, p0, LF0/Y;->b:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0}, LX/b;->t()I

    move-result v0

    return v0
.end method

.method public final f()LX/b;
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    return-object v0
.end method

.method public final g(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF0/Y;->a:LX/b;

    invoke-virtual {v0, p1}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LF0/Y;->b:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-object p1
.end method
