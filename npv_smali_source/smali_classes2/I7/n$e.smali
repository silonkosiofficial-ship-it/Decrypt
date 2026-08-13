.class final LI7/n$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/n;->o(Ljava/lang/String;Ljava/lang/String;)LO7/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/n$e;

    invoke-direct {v0}, LI7/n$e;-><init>()V

    sput-object v0, LI7/n$e;->D:LI7/n$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/U;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lq8/c;->j:Lq8/c;

    invoke-virtual {v1, p1}, Lq8/c;->q(LO7/m;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " | "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LI7/I;->a:LI7/I;

    invoke-virtual {v1, p1}, LI7/I;->f(LO7/U;)LI7/i;

    move-result-object p1

    invoke-virtual {p1}, LI7/i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/U;

    invoke-virtual {p0, p1}, LI7/n$e;->a(LO7/U;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
