.class public final LU7/m;
.super LU7/f;
.source "SourceFile"

# interfaces
.implements Le8/h;


# instance fields
.field private final c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ln8/f;Ljava/lang/Class;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU7/f;-><init>(Ln8/f;Ly7/k;)V

    iput-object p2, p0, LU7/m;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public c()Le8/x;
    .locals 2

    sget-object v0, LU7/z;->a:LU7/z$a;

    iget-object v1, p0, LU7/m;->c:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object v0

    return-object v0
.end method
