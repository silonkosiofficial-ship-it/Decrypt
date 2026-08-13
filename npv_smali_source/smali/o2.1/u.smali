.class public final Lo2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lx7/l;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBindStatement"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/u;->a:Ljava/lang/String;

    new-instance p1, Lo2/u$b;

    invoke-direct {p1, p2}, Lo2/u$b;-><init>(Lx7/l;)V

    iput-object p1, p0, Lo2/u;->b:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lx7/l;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lo2/u$a;->D:Lo2/u$a;

    :cond_0
    invoke-direct {p0, p1, p2}, Lo2/u;-><init>(Ljava/lang/String;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public final a()Lx7/l;
    .locals 1

    iget-object v0, p0, Lo2/u;->b:Lx7/l;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo2/u;->a:Ljava/lang/String;

    return-object v0
.end method
