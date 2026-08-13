.class public final LP9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/c$a;
    }
.end annotation


# static fields
.field public static final d:LP9/c$a;

.field public static final e:LX9/g;

.field public static final f:LX9/g;

.field public static final g:LX9/g;

.field public static final h:LX9/g;

.field public static final i:LX9/g;

.field public static final j:LX9/g;


# instance fields
.field public final a:LX9/g;

.field public final b:LX9/g;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP9/c$a;-><init>(Ly7/k;)V

    sput-object v0, LP9/c;->d:LP9/c$a;

    sget-object v0, LX9/g;->F:LX9/g$a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v1

    sput-object v1, LP9/c;->e:LX9/g;

    const-string v1, ":status"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v1

    sput-object v1, LP9/c;->f:LX9/g;

    const-string v1, ":method"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v1

    sput-object v1, LP9/c;->g:LX9/g;

    const-string v1, ":path"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v1

    sput-object v1, LP9/c;->h:LX9/g;

    const-string v1, ":scheme"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v1

    sput-object v1, LP9/c;->i:LX9/g;

    const-string v1, ":authority"

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    sput-object v0, LP9/c;->j:LX9/g;

    return-void
.end method

.method public constructor <init>(LX9/g;LX9/g;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP9/c;->a:LX9/g;

    iput-object p2, p0, LP9/c;->b:LX9/g;

    invoke-virtual {p1}, LX9/g;->I()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, LX9/g;->I()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, LP9/c;->c:I

    return-void
.end method

.method public constructor <init>(LX9/g;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX9/g;->F:LX9/g$a;

    invoke-virtual {v0, p2}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LP9/c;-><init>(LX9/g;LX9/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX9/g;->F:LX9/g$a;

    invoke-virtual {v0, p1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object p1

    invoke-virtual {v0, p2}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LP9/c;-><init>(LX9/g;LX9/g;)V

    return-void
.end method


# virtual methods
.method public final a()LX9/g;
    .locals 1

    iget-object v0, p0, LP9/c;->a:LX9/g;

    return-object v0
.end method

.method public final b()LX9/g;
    .locals 1

    iget-object v0, p0, LP9/c;->b:LX9/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LP9/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LP9/c;

    iget-object v1, p0, LP9/c;->a:LX9/g;

    iget-object v3, p1, LP9/c;->a:LX9/g;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LP9/c;->b:LX9/g;

    iget-object p1, p1, LP9/c;->b:LX9/g;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LP9/c;->a:LX9/g;

    invoke-virtual {v0}, LX9/g;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LP9/c;->b:LX9/g;

    invoke-virtual {v1}, LX9/g;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LP9/c;->a:LX9/g;

    invoke-virtual {v1}, LX9/g;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP9/c;->b:LX9/g;

    invoke-virtual {v1}, LX9/g;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
