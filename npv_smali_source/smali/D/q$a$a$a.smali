.class final LD/q$a$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/q$a$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD/q$a;


# direct methods
.method constructor <init>(LD/q$a;)V
    .locals 0

    iput-object p1, p0, LD/q$a$a$a;->D:LD/q$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 1

    iget-object p1, p0, LD/q$a$a$a;->D:LD/q$a;

    new-instance v0, LD/q$a$a$a$a;

    invoke-direct {v0, p1}, LD/q$a$a$a$a;-><init>(LD/q$a;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LD/q$a$a$a;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
