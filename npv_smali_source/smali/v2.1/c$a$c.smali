.class final Lv2/c$a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/c$a;->j0(Ljava/lang/String;[Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;

.field final synthetic E:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lv2/c$a$c;->D:Ljava/lang/String;

    iput-object p2, p0, Lv2/c$a$c;->E:[Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz2/d;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv2/c$a$c;->D:Ljava/lang/String;

    iget-object v1, p0, Lv2/c$a$c;->E:[Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lz2/d;->j0(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-virtual {p0, p1}, Lv2/c$a$c;->a(Lz2/d;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
