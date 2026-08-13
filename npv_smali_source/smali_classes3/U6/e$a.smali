.class public final LU6/e$a;
.super LU6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final e:Lx7/a;


# direct methods
.method public constructor <init>(Lx7/a;Lx7/a;LT6/p;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispose"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "partHeaders"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, LU6/e;-><init>(Lx7/a;LT6/p;Ly7/k;)V

    iput-object p1, p0, LU6/e$a;->e:Lx7/a;

    return-void
.end method


# virtual methods
.method public final f()Lx7/a;
    .locals 1

    iget-object v0, p0, LU6/e$a;->e:Lx7/a;

    return-object v0
.end method
