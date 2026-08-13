.class final Le0/b$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Le0/c;

.field final synthetic E:Le0/j;

.field final synthetic F:Le0/g;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/Object;

.field final synthetic I:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Le0/c;Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Le0/b$c;->D:Le0/c;

    iput-object p2, p0, Le0/b$c;->E:Le0/j;

    iput-object p3, p0, Le0/b$c;->F:Le0/g;

    iput-object p4, p0, Le0/b$c;->G:Ljava/lang/String;

    iput-object p5, p0, Le0/b$c;->H:Ljava/lang/Object;

    iput-object p6, p0, Le0/b$c;->I:[Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Le0/b$c;->D:Le0/c;

    iget-object v1, p0, Le0/b$c;->E:Le0/j;

    iget-object v2, p0, Le0/b$c;->F:Le0/g;

    iget-object v3, p0, Le0/b$c;->G:Ljava/lang/String;

    iget-object v4, p0, Le0/b$c;->H:Ljava/lang/Object;

    iget-object v5, p0, Le0/b$c;->I:[Ljava/lang/Object;

    invoke-virtual/range {v0 .. v5}, Le0/c;->i(Le0/j;Le0/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le0/b$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
