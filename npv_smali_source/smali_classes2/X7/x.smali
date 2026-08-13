.class public final LX7/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/x$b;
    }
.end annotation


# static fields
.field public static final d:LX7/x$b;

.field private static final e:LX7/x;


# instance fields
.field private final a:LX7/z;

.field private final b:Lx7/l;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LX7/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX7/x$b;-><init>(Ly7/k;)V

    sput-object v0, LX7/x;->d:LX7/x$b;

    new-instance v0, LX7/x;

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LX7/v;->b(Li7/l;ILjava/lang/Object;)LX7/z;

    move-result-object v1

    sget-object v2, LX7/x$a;->L:LX7/x$a;

    invoke-direct {v0, v1, v2}, LX7/x;-><init>(LX7/z;Lx7/l;)V

    sput-object v0, LX7/x;->e:LX7/x;

    return-void
.end method

.method public constructor <init>(LX7/z;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "jsr305"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getReportLevelForAnnotation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/x;->a:LX7/z;

    iput-object p2, p0, LX7/x;->b:Lx7/l;

    invoke-virtual {p1}, LX7/z;->d()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, LX7/v;->e()Ln8/c;

    move-result-object p1

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LX7/G;->E:LX7/G;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LX7/x;->c:Z

    return-void
.end method

.method public static final synthetic a()LX7/x;
    .locals 1

    sget-object v0, LX7/x;->e:LX7/x;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LX7/x;->c:Z

    return v0
.end method

.method public final c()Lx7/l;
    .locals 1

    iget-object v0, p0, LX7/x;->b:Lx7/l;

    return-object v0
.end method

.method public final d()LX7/z;
    .locals 1

    iget-object v0, p0, LX7/x;->a:LX7/z;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JavaTypeEnhancementState(jsr305="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX7/x;->a:LX7/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", getReportLevelForAnnotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX7/x;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
