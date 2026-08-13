.class public final LB8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LB8/k;

.field private final b:Lk8/c;

.field private final c:LO7/m;

.field private final d:Lk8/g;

.field private final e:Lk8/h;

.field private final f:Lk8/a;

.field private final g:LD8/f;

.field private final h:LB8/E;

.field private final i:LB8/x;


# direct methods
.method public constructor <init>(LB8/k;Lk8/c;LO7/m;Lk8/g;Lk8/h;Lk8/a;LD8/f;LB8/E;Ljava/util/List;)V
    .locals 1

    .prologue
    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameters"

    invoke-static {p9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/m;->a:LB8/k;

    iput-object p2, p0, LB8/m;->b:Lk8/c;

    iput-object p3, p0, LB8/m;->c:LO7/m;

    iput-object p4, p0, LB8/m;->d:Lk8/g;

    iput-object p5, p0, LB8/m;->e:Lk8/h;

    iput-object p6, p0, LB8/m;->f:Lk8/a;

    iput-object p7, p0, LB8/m;->g:LD8/f;

    new-instance v0, LB8/E;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Deserializer for \""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, LO7/I;->getName()Ln8/f;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    if-eqz p7, :cond_1

    invoke-interface {p7}, LD8/f;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object p6, p1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "[container not found]"

    goto :goto_0

    :goto_2
    move-object p1, v0

    move-object p2, p0

    move-object p3, p8

    move-object p4, p9

    invoke-direct/range {p1 .. p6}, LB8/E;-><init>(LB8/m;LB8/E;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, LB8/m;->h:LB8/E;

    new-instance p1, LB8/x;

    invoke-direct {p1, p0}, LB8/x;-><init>(LB8/m;)V

    iput-object p1, p0, LB8/m;->i:LB8/x;

    return-void
.end method

.method public static synthetic b(LB8/m;LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;ILjava/lang/Object;)LB8/m;
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    iget-object p3, p0, LB8/m;->b:Lk8/c;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    iget-object p4, p0, LB8/m;->d:Lk8/g;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    iget-object p5, p0, LB8/m;->e:Lk8/h;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    iget-object p6, p0, LB8/m;->f:Lk8/a;

    :cond_3
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, LB8/m;->a(LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;)LB8/m;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LO7/m;Ljava/util/List;Lk8/c;Lk8/g;Lk8/h;Lk8/a;)LB8/m;
    .locals 12

    .prologue
    move-object v0, p0

    const-string v1, "descriptor"

    move-object v5, p1

    invoke-static {p1, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "typeParameterProtos"

    move-object v11, p2

    invoke-static {p2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "nameResolver"

    move-object v4, p3

    invoke-static {p3, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "typeTable"

    move-object/from16 v6, p4

    invoke-static {v6, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "versionRequirementTable"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "metadataVersion"

    move-object/from16 v8, p6

    invoke-static {v8, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LB8/m;

    iget-object v3, v0, LB8/m;->a:LB8/k;

    invoke-static/range {p6 .. p6}, Lk8/i;->b(Lk8/a;)Z

    move-result v7

    if-eqz v7, :cond_0

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    iget-object v2, v0, LB8/m;->e:Lk8/h;

    goto :goto_0

    :goto_1
    iget-object v9, v0, LB8/m;->g:LD8/f;

    iget-object v10, v0, LB8/m;->h:LB8/E;

    move-object v2, v1

    move-object v4, p3

    move-object v5, p1

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object v11, p2

    invoke-direct/range {v2 .. v11}, LB8/m;-><init>(LB8/k;Lk8/c;LO7/m;Lk8/g;Lk8/h;Lk8/a;LD8/f;LB8/E;Ljava/util/List;)V

    return-object v1
.end method

.method public final c()LB8/k;
    .locals 1

    iget-object v0, p0, LB8/m;->a:LB8/k;

    return-object v0
.end method

.method public final d()LD8/f;
    .locals 1

    iget-object v0, p0, LB8/m;->g:LD8/f;

    return-object v0
.end method

.method public final e()LO7/m;
    .locals 1

    iget-object v0, p0, LB8/m;->c:LO7/m;

    return-object v0
.end method

.method public final f()LB8/x;
    .locals 1

    iget-object v0, p0, LB8/m;->i:LB8/x;

    return-object v0
.end method

.method public final g()Lk8/c;
    .locals 1

    iget-object v0, p0, LB8/m;->b:Lk8/c;

    return-object v0
.end method

.method public final h()LE8/n;
    .locals 1

    iget-object v0, p0, LB8/m;->a:LB8/k;

    invoke-virtual {v0}, LB8/k;->u()LE8/n;

    move-result-object v0

    return-object v0
.end method

.method public final i()LB8/E;
    .locals 1

    iget-object v0, p0, LB8/m;->h:LB8/E;

    return-object v0
.end method

.method public final j()Lk8/g;
    .locals 1

    iget-object v0, p0, LB8/m;->d:Lk8/g;

    return-object v0
.end method

.method public final k()Lk8/h;
    .locals 1

    iget-object v0, p0, LB8/m;->e:Lk8/h;

    return-object v0
.end method
