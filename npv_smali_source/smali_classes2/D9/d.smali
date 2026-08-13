.class public final LD9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD9/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;

.field private final c:LE9/a;

.field private final d:Lx7/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;LE9/a;LC9/O;Lx7/r;)V
    .locals 0

    const-string p4, "route"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "deepLinks"

    invoke-static {p2, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "content"

    invoke-static {p5, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/d;->a:Ljava/lang/String;

    iput-object p2, p0, LD9/d;->b:Ljava/util/List;

    iput-object p3, p0, LD9/d;->c:LE9/a;

    iput-object p5, p0, LD9/d;->d:Lx7/r;

    return-void
.end method


# virtual methods
.method public a()Lx7/r;
    .locals 1

    iget-object v0, p0, LD9/d;->d:Lx7/r;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LD9/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD9/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()LE9/a;
    .locals 1

    iget-object v0, p0, LD9/d;->c:LE9/a;

    return-object v0
.end method

.method public final e()LC9/O;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
