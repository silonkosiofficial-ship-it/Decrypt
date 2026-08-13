.class final Le0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/l;
.implements LV/Z0;


# instance fields
.field private C:Le0/j;

.field private D:Le0/g;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/Object;

.field private G:[Ljava/lang/Object;

.field private H:Le0/g$a;

.field private final I:Lx7/a;


# direct methods
.method public constructor <init>(Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/c;->C:Le0/j;

    iput-object p2, p0, Le0/c;->D:Le0/g;

    iput-object p3, p0, Le0/c;->E:Ljava/lang/String;

    iput-object p4, p0, Le0/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Le0/c;->G:[Ljava/lang/Object;

    new-instance p1, Le0/c$a;

    invoke-direct {p1, p0}, Le0/c$a;-><init>(Le0/c;)V

    iput-object p1, p0, Le0/c;->I:Lx7/a;

    return-void
.end method

.method public static final synthetic e(Le0/c;)Le0/j;
    .locals 0

    iget-object p0, p0, Le0/c;->C:Le0/j;

    return-object p0
.end method

.method public static final synthetic f(Le0/c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Le0/c;->F:Ljava/lang/Object;

    return-object p0
.end method

.method private final h()V
    .locals 3

    .prologue
    iget-object v0, p0, Le0/c;->D:Le0/g;

    iget-object v1, p0, Le0/c;->H:Le0/g$a;

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    iget-object v1, p0, Le0/c;->I:Lx7/a;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Le0/b;->a(Le0/g;Ljava/lang/Object;)V

    iget-object v1, p0, Le0/c;->E:Ljava/lang/String;

    iget-object v2, p0, Le0/c;->I:Lx7/a;

    invoke-interface {v0, v1, v2}, Le0/g;->e(Ljava/lang/String;Lx7/a;)Le0/g$a;

    move-result-object v0

    iput-object v0, p0, Le0/c;->H:Le0/g$a;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "entry("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le0/c;->H:Le0/g$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") is not null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Le0/c;->D:Le0/g;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Le0/g;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public b()V
    .locals 1

    .prologue
    iget-object v0, p0, Le0/c;->H:Le0/g$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le0/g$a;->a()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    iget-object v0, p0, Le0/c;->H:Le0/g$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le0/g$a;->a()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    invoke-direct {p0}, Le0/c;->h()V

    return-void
.end method

.method public final g([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Le0/c;->G:[Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le0/c;->F:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final i(Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    iget-object v0, p0, Le0/c;->D:Le0/g;

    const/4 v1, 0x1

    if-eq v0, p2, :cond_0

    iput-object p2, p0, Le0/c;->D:Le0/g;

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Le0/c;->E:Ljava/lang/String;

    invoke-static {v0, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p3, p0, Le0/c;->E:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    iput-object p1, p0, Le0/c;->C:Le0/j;

    iput-object p4, p0, Le0/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Le0/c;->G:[Ljava/lang/Object;

    iget-object p1, p0, Le0/c;->H:Le0/g$a;

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    invoke-interface {p1}, Le0/g$a;->a()V

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Le0/c;->H:Le0/g$a;

    invoke-direct {p0}, Le0/c;->h()V

    :cond_3
    return-void
.end method
