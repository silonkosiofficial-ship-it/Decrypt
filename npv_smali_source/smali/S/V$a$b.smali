.class final LS/V$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/V$a;->a(LS/P0;Ljava/util/Locale;)Le0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/P0;

.field final synthetic E:Ljava/util/Locale;


# direct methods
.method constructor <init>(LS/P0;Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, LS/V$a$b;->D:LS/P0;

    iput-object p2, p0, LS/V$a$b;->E:Ljava/util/Locale;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LS/V;
    .locals 9

    new-instance v8, LS/V;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Long;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    new-instance v3, LE7/i;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v5, 0x3

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v3, v0, v5}, LE7/i;-><init>(II)V

    const/4 v0, 0x4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, LS/Y;->d(I)I

    move-result v4

    iget-object v5, p0, LS/V$a$b;->D:LS/P0;

    iget-object v6, p0, LS/V$a$b;->E:Ljava/util/Locale;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LS/V;-><init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;Ly7/k;)V

    return-object v8
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LS/V$a$b;->a(Ljava/util/List;)LS/V;

    move-result-object p1

    return-object p1
.end method
