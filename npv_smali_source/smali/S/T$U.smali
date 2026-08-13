.class final LS/T$U;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->K(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;LV/n;II)LS/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:Ljava/lang/Long;

.field final synthetic F:LE7/i;

.field final synthetic G:I

.field final synthetic H:LS/P0;

.field final synthetic I:Ljava/util/Locale;


# direct methods
.method constructor <init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, LS/T$U;->D:Ljava/lang/Long;

    iput-object p2, p0, LS/T$U;->E:Ljava/lang/Long;

    iput-object p3, p0, LS/T$U;->F:LE7/i;

    iput p4, p0, LS/T$U;->G:I

    iput-object p5, p0, LS/T$U;->H:LS/P0;

    iput-object p6, p0, LS/T$U;->I:Ljava/util/Locale;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LS/V;
    .locals 9

    new-instance v8, LS/V;

    iget-object v1, p0, LS/T$U;->D:Ljava/lang/Long;

    iget-object v2, p0, LS/T$U;->E:Ljava/lang/Long;

    iget-object v3, p0, LS/T$U;->F:LE7/i;

    iget v4, p0, LS/T$U;->G:I

    iget-object v5, p0, LS/T$U;->H:LS/P0;

    iget-object v6, p0, LS/T$U;->I:Ljava/util/Locale;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LS/V;-><init>(Ljava/lang/Long;Ljava/lang/Long;LE7/i;ILS/P0;Ljava/util/Locale;Ly7/k;)V

    return-object v8
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$U;->a()LS/V;

    move-result-object v0

    return-object v0
.end method
